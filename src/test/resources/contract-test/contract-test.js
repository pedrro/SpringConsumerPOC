var Contract = require('consumer-contracts').Contract;
var Joi = require('consumer-contracts').Joi;

module.exports = new Contract({
  name: 'gturnquist-quoters',
  consumer: 'test',
  request: {
    method: 'GET',
    url: 'http://gturnquist-quoters.cfapps.io/api/random'
  },
  response: {
    statusCode: 200,
    body: Joi.object().keys({
      type: Joi.string(),
      value: Joi.valueOf({
        id: Joi.number().integer(),
        quote: Joi.string()
      })
    })
  }
});
